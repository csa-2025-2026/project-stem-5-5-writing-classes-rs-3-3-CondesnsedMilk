public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public Oven(int maxTemp, int currentTemp)
    {
        if(maxTemp > 0 && maxTemp <= 500)
        {
            this.maxTemp = maxTemp;
            
        }
        else
        {
            this.maxTemp = 500;
        }

        if (!(currentTemp > this.maxTemp || currentTemp < 0))
        {
            this.currentTemp = currentTemp;
        }
        else
        {
            this.currentTemp = this.maxTemp;
        }
    }

    public int getMaxTemp()
    {
        return maxTemp;
    }

    public int getCurrentTemp()
    {
        return currentTemp;
    }

    public void TurnOff()
    {
        if(currentTemp > 0)
        {
            currentTemp = 0;
        }
    }

    public boolean IsOn()
    {
        if(currentTemp >= 0)
        {
            return true;
        }

        return false;
    }

    public void SetMaxTemp(int newMaxTemp)
    {
        maxTemp = newMaxTemp;
    }

    public void SetCurrentTemp(int newCurrentTemp)
    {
        currentTemp = newCurrentTemp;
    }

    public void PreHeat(int temp)
    {
        if(temp > maxTemp)
        {
            currentTemp = maxTemp;
        }
        else if(temp < maxTemp && temp > 0)
        {
            currentTemp = temp;
        }
    }

    public String toString()
    {
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp + " degrees.\n";
    }

}
