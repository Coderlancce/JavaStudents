package main.factories;

public class SortedIdGenerator implements IdGenerator{
    private Integer countId = 0;

    @Override
    public String idGenerator() {
        this.countId += 1;
        return "STD" + String.format("%02d", countId);
    }
}
