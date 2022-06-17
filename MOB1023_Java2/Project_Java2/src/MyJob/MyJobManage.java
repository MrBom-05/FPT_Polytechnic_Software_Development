package MyJob;

import java.util.ArrayList;

public class MyJobManage implements MyJobDAOInterface{
    private ArrayList<MyJob> list;

    public MyJobManage() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void insert(MyJob myJob) {
        this.list.add(myJob);
    }

    @Override
    public void update(int viTri, MyJob myJob) {
        this.list.set(viTri, myJob);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<MyJob> getList() {
        return this.list;
    }

    @Override
    public MyJob getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<MyJob> list) {
        this.list = list;
    }
    
}
