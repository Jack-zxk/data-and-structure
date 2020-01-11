package hashtable;

public class HashTable {

    int[] elem; //散列表数据存储数组
    public int count;   //散列表实际存储大小
    private int maxsize = 20;   //散列表最大容量

    private final int NULLKEY = -32769;   //散列表初始值
    private final int SUCCESS = 1;
    private final int UNSUCCESS = 0;

    public HashTable() {
        this.elem = new int[maxsize];
        initHashTable();
    }

    public HashTable(int maxsize) {
        this.maxsize = maxsize;
        this.elem = new int[maxsize];
        initHashTable();
    }

    public void initHashTable(){
        for (int i = 0; i < maxsize; i++) {
            this.elem[i] = NULLKEY;
        }
    }

    /**
     * 散列函数
     * 保留余数法
     * @return
     */
    public int Hash(int key){
        int add =  key % maxsize;
        return add;
    }

    /**
     * hash表添加数据
     * @param key
     */
    public void insertHash(int key){
        int addr = Hash(key);  //求散列地址
        while (this.elem[addr] != NULLKEY){
            addr = Hash(addr+1);    //开放定址法的线性探索
        }
        this.elem[addr] = key;
        ++count;
    }

    /**
     * 查找hash表中的数据
     * @param key
     * @return
     */
    public int searchHash(int key){
        int addr = Hash(key);
        while (this.elem[addr] != key){
            addr = Hash(addr+1);
            if (this.elem[addr] == NULLKEY || addr == Hash(key)){
                return UNSUCCESS;
            }
        }
        return SUCCESS;
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.insertHash(8);
        hashTable.insertHash(4);
        hashTable.insertHash(6);

        System.out.println("cout:" + hashTable.count);
		System.out.println("cout:" + hashTable.count);


    }

}
