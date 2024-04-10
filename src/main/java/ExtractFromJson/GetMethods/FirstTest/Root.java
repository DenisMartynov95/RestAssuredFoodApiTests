package ExtractFromJson.GetMethods.FirstTest;

import java.util.ArrayList;

public class Root {

    private ArrayList<Result> results;
    private int offset;
    private int number;
    private int totalResults;

    public ArrayList<Result> getResults() {
        return results;
    }

    public int getOffset() {
        return offset;
    }

    public int getNumber() {
        return number;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public Root(ArrayList<Result> results, int offset, int number, int totalResults) {
        this.results = results;
        this.offset = offset;
        this.number = number;
        this.totalResults = totalResults;
    }

    public Root(){
    }
}
