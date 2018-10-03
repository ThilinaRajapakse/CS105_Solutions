package pdn.scs.lab5_access_modifiers.service_record;


/**
 * Represents the service record of an agent.
 * This class contains the details of service of an agent.
 * It has the rank, years of service, and the number of succesful missions.
 */
public class ServiceRecord
{
    private String rank;
    private int yearsOfService;
    private int successfulMissionCount;

    /**
     * Constructor method for a ServiceRecord
     *
     * @param rank - The current rank of the Agent with this ServiceRecord
     * @param yearsOfService - The years of service of the Agent with this ServiceRecord
     * @param successfulMissionCount - The number of successful missions of the Agent with this ServiceRecord
     */
    public ServiceRecord(String rank, int yearsOfService, int successfulMissionCount)
    {
        this.rank = rank;
        this.yearsOfService = yearsOfService;
        this.successfulMissionCount = successfulMissionCount;
    }

    public void incrementYearsOfService()
    {
        this.successfulMissionCount++;
    }

    public int getYearsOfService()
    {
        return this.yearsOfService;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public String getRank()
    {
        return this.rank;
    }

    public void incrementSuccessfulMissionCount()
    {
        this.successfulMissionCount++;
    }

    public int getSuccessfulMissionCount()
    {
        return this.successfulMissionCount;
    }

    public void setYearsOfService(int yearsOfService)
    {
        this.yearsOfService = yearsOfService;
    }

    public void setSuccessfulMissionCount(int successfulMissionCount)
    {
        this.successfulMissionCount = successfulMissionCount;
    }
}
