package pdn.scs.lab5_access_modifiers;

import pdn.scs.lab5_access_modifiers.agent.Agent;
import pdn.scs.lab5_access_modifiers.service_record.ServiceRecord;

public class SecretService
{
    public static void main(String[] args)
    {
        // Create a new Agent object
//        Agent a1 = new Agent();
//        a1.setCodeName("007");
//        a1.setRealName("James Bond");
//        a1.setIdNumber(191083);
//        // Test the Agent class methods
//        System.out.println(a1.getIdNumber());
//        System.out.println(a1.getRealName());

//        // Create a new ServiceRecord object
//        ServiceRecord s1 = new ServiceRecord();
//        s1.setRank("Commander");
//        s1.setYearsOfService(20);
//        s1.setSuccessfulMissionCount(38);
//        // Test the ServiceRecord class methods
//        System.out.println(s1.getRank());
//        System.out.println(s1.getYearsOfService());
//        System.out.println(s1.getSuccessfulMissionCount());

        // Create a new Agent
        Agent a2 = new Agent("Black Widow", "Natasha Romanoff", 125159, "Special Agent"
        , 10, 29);
        printAgent(a2);


    }

    private static void printAgent(Agent agent)
    {
        System.out.println("ID: " + agent.getIdNumber());
        System.out.println("Real Name: " + agent.getRealName());
        System.out.println("Code Name: " + agent.getCodeName());
        agent.printServiceRecord();
    }
}
