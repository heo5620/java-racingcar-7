package racingcar.model;

public class Car {

    private final String name;
    private final RaceRecords raceRecords;

    public Car(String name) {
        validateCarName(name);
        this.name = name;
        this.raceRecords = new RaceRecords();
    }

    public void initializeRecords(int raceCount) {
        raceRecords.initializeRecords(raceCount);
    }

    public void moveForward(int round) {
        raceRecords.recordRaceByRound(round);
    }

    public void recordPrevRaceByRound(int round) {
        raceRecords.recordPrevRaceByRound(round);
    }

    public void showRaceRecordsByRound(int round) {
        String raceRecordsByRound = raceRecords.getByRound(round);
        System.out.println(getName() + " : " + raceRecordsByRound);
    }

    public String getName() {
        return name;
    }

    public int getRecordLengthByRound(int round) {
        return raceRecords.lengthByRound(round);
    }

    private void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }
}