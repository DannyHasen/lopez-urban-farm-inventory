package com.projectEvergreen.seed_inventory.io;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectEvergreen.seed_inventory.model.Crop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CropStore
{
    private final Path file;
    private final ObjectMapper mapper = new ObjectMapper();

    public CropStore(Path file)
    {
        this.file = file;
    }

    public List<Crop> loadAll() throws IOException
    {
        if (!Files.exists(file))
        {
            return new ArrayList<>();
        }

        byte[] data = Files.readAllBytes(file);
        return mapper.readValue(data, new TypeReference<List<Crop>>() {});
    }

    public void saveAll(List<Crop> crops) throws IOException
    {
        if (file.getParent() != null && !Files.exists(file.getParent()))
        {
            Files.createDirectories(file.getParent());
        }

        byte[] json = mapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(crops);

        Path temp = Files.createTempFile(file.getParent(), "crops-", ".tmp");
        Files.write(temp, json, StandardOpenOption.TRUNCATE_EXISTING);

        Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    public static CropStore defaultStore()
    {
        Path home = Paths.get(System.getProperty("user.home"));
        return new CropStore(home.resolve(".evergreen/data/crops.json"));
    }
}
