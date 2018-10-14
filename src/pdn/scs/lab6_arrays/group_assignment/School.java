package pdn.scs.lab6_arrays.group_assignment;

import pdn.scs.lab6_arrays.group_assignment.group.Group;

public class School
{
    public static void main(String[] arg)
    {
        Group[] groups = new Group[3];  // Create an array of Group objects. Each element of this array can hold a
                                        // Group object. However, we have not yet created the Group objects. We need to
                                        // create the objects by calling the constructor method of the Group class.

        for (int i = 0; i < groups.length; i++)
        {
            groups[i] = new Group(4);   // Loop through the groups array and create Group objects.
        }

        // Now that the Group objects have been created, we can test the methods defined in the Group class.

        for (int i = 0; i < groups.length; i++)
        {
            groups[i].assign_marks();
            groups[i].print();
            groups[i].calculate_average();
            groups[i].find_highest();
            System.out.println("-------------------------------------------------------");
        }


    }
}
