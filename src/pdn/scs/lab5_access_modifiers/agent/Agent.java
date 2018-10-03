package pdn.scs.lab5_access_modifiers.agent;

import pdn.scs.lab5_access_modifiers.service_record.ServiceRecord;

/**
 * Represents an Agent.
 * An Agent has a codeName, realName, idNumber, and a serviceRecord.
 */
public class Agent
{
    private String codeName;
    private String realName;
    private double idNumber;
    private ServiceRecord serviceRecord;

    public Agent(String codeName, String realName, double idNumber, String rank, int yearsOfService, int successfulMissionCount)
    {
        this.codeName = codeName;
        this.realName = realName;
        this.idNumber = idNumber;

        this.serviceRecord = new ServiceRecord(rank, yearsOfService, successfulMissionCount);
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public String getRealName()
    {
        return this.realName;
    }

    public double getIdNumber()
    {
        return this.idNumber;
    }

    public void setIdNumber(double idNumber)
    {
        // Check whether idNumber has less than 7 digits
        // Find the method used to count the number of digits in a number
        if (((int) Math.log10(idNumber) + 1) < 7)
        {
            this.idNumber = idNumber;
        }
        else
        {
            System.out.println();
        }
    }

    public void printServiceRecord()
    {
        System.out.println("Rank: " + this.serviceRecord.getRank());
        System.out.println("Years of service" + this.serviceRecord.getYearsOfService());
        System.out.println("Successful missions: " + this.serviceRecord.getSuccessfulMissionCount());
    }

    public String getCodeName()
    {
        return this.codeName;
    }

    public void setCodeName(String codeName)
    {
        this.codeName = codeName;
    }
}
