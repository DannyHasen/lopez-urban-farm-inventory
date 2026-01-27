package com.projectEvergreen.seed_inventory.model;

public class Crop
{
    public enum Season
    {
        WINTER, SPRING, SUMMER, FALL
    }

    private String name;
    private Season season;
    private int currentAmount;
    private Integer manualAvgCropPeriodDays;

    public Crop() {
        //needed, left empty
    }

    public Crop(String name, Season season, int currentAmount, Integer manualAvgCropPeriodDays)
    {
        this.name = name;
        this.season = season;
        this.currentAmount = currentAmount;
        this.manualAvgCropPeriodDays = manualAvgCropPeriodDays;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Season getSeason()
    {
        return season;
    }

    public void setSeason(Season season)
    {
        this.season = season;
    }

    public int getCurrentAmount()
    {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount)
    {
        this.currentAmount = currentAmount;
    }

    public Integer getManualAvgCropPeriodDays()
    {
        return manualAvgCropPeriodDays;
    }

    public void setManualAvgCropPeriodDays(Integer manualAvgCropPeriodDays)
    {
        this.manualAvgCropPeriodDays = manualAvgCropPeriodDays;
    }
}
