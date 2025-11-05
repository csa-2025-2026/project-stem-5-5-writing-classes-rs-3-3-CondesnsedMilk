public class Oven
{
    private int maxTemp;
    private int currentTemp;

    Open(int mexTemp, int currentTemp)
    {
        if()
        {
            this.maxTemp = maxTemp;
            this.currentTemp = currentTemp;
        }
        else if ()
        {
            this.maxTemp = 500;
            this.currentTemp = 0;
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
        if(currentTemp > 0)
        {
            return true;
        }
    }

    public void PreHeat(int temp)
    {
        if(temp > maxTemp)
        {
            currentTemp = maxTemp
            return currentTemp;
        }
        else if(temp <= 0)
        {
            return currentTemp;
        }
        currentTemp = temp;
        return currentTemp;
    }

    public String toString()
    {

    }

}
