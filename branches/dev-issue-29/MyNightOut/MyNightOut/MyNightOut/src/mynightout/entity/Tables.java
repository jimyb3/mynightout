/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.entity;

/**
 *
 * @author ioanna
 */
public class Tables   implements java.io.Serializable{
    private int clubId;
    private int firstRow;
    private int secondRow;
    private int thirdRow;
    private int fourthRow;
    private int fifthRow;
    private int sixthRow;
    private Nightclub nightclub;

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public void setFirstRow(int firstRow) {
        this.firstRow = firstRow;
    }

    public void setSecondRow(int secondRow) {
        this.secondRow = secondRow;
    }

    public void setThirdRow(int thirdRow) {
        this.thirdRow = thirdRow;
    }

    public void setFourthRow(int fourthRow) {
        this.fourthRow = fourthRow;
    }

    public void setFifthRow(int fifthRow) {
        this.fifthRow = fifthRow;
    }

    public void setSixthRow(int sixthRow) {
        this.sixthRow = sixthRow;
    }

    public int getClubId() {
        return clubId;
    }

    public int getFirstRow() {
        return firstRow;
    }

    public int getSecondRow() {
        return secondRow;
    }

    public int getThirdRow() {
        return thirdRow;
    }

    public int getFourthRow() {
        return fourthRow;
    }

    public int getFifthRow() {
        return fifthRow;
    }

    public int getSixthRow() {
        return sixthRow;
    }
    
    
}
