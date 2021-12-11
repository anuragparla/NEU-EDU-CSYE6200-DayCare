package edu.neu.csye6200.model;

import java.util.Vector;

/**
 *
 * @author hiralrnagda
 */
public class Classroom {
    Vector groupIds;
    int minAge;
    int maxAge;
    int maxGroups;

    public Vector getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(Vector groupIds) {
        this.groupIds = groupIds;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMaxGroups() {
        return maxGroups;
    }

    public void setMaxGroups(int maxGroups) {
        this.maxGroups = maxGroups;
    }
    
    
    
    
}
