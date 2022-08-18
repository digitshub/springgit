package Field.dep;

public class address {
    private int block_no;
    private String road;

    public int getBlock_no() {
        return block_no;
    }

    public void setBlock_no(int block_no) {
        this.block_no = block_no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public address(int block_no, String road) {
        this.block_no = block_no;
        this.road = road;
    }

    public address(){
        super();

    }
    public String toString(){
        return "address="+block_no+" "+road;
    }




}
