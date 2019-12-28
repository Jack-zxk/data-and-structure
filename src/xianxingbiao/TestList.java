package xianxingbiao;

public class TestList implements IList{

    private Object[] listElem; //线性表存储空间
    private int curlen; //当前长度

    public TestList(int maxSize) {
        curlen = 0;
        listElem = new Object[maxSize]; //未顺序表分配maxSize个存储单元
    }

    public Object getListElem(int i){

        return listElem[i];
    }


    @Override
    public void insert(int i, Object x) throws Exception {
        if(i == curlen){
            throw new Exception("顺序表已满");
        }
        if(i < 0 || i > curlen){
            throw new Exception("插入位置不合理");
        }
        for(int j = curlen; j > i ; j--){
            listElem[j] = listElem[j-1];
            listElem[i] = x;
        }
        curlen++;
    }

    @Override
    public void delete(int i) throws Exception {
        if(i > curlen || i < 0){
            throw new Exception("删除位置不合理");
        }
        for (int j = i;j < curlen; j++){
            listElem[j] = listElem[j+1];
        }
        curlen--;
    }

    public void disList(){
        for(int j =0; j < curlen;j++){
            System.out.println(listElem[j]);
        }
    }
}
