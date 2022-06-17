package MyJob;

import java.util.ArrayList;

public interface MyJobDAOInterface {

    public void insert(MyJob myJob);

    public void update(int viTri, MyJob myJob);

    public void delete(int viTri);

    public ArrayList<MyJob> getList();

    public MyJob getByID(int viTri);

    public void setList(ArrayList<MyJob> list);
}
