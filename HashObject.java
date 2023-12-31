/************************************************************************
 * @file DNAparser.java
 * @brief This file is for the Hash table and implements different get and
 *        set methods that help when coding other classes
 * @author Pelin Blanton and Kyle Shepherd
 * @date December 8, 2023
 ************************************************************************/
public class HashObject {
    // You might need other variables to finish the task
    String id;
    String seq;

    // Constructor
    public HashObject(String id, String seq) {
        this.id = id; //initialize id
        this.seq = seq; //initialize seq
    }

    // Get the ID from the HashObject
    public String getId() {
        return id;
    }

    // Get the sequence from the HashObject
    public String getSeq() {
        return seq;
    }
}