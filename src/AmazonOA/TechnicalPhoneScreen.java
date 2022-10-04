package AmazonOA;

import java.util.ArrayList;
//first self introduction

public class TechnicalPhoneScreen {
    //Amazon warehouse  {small, medium, large}
    //{- - - -}
    //Pack size 1 id = 123
    //{123 - - -}
    class Warehouse{
        ArrayList<ArrayList<Pack>> storage = new ArrayList<>();

        public Warehouse(ArrayList<ArrayList<Pack>> storage) {
            this.storage = storage;
            storage.add(new ArrayList<>(40000));
            storage.add(new ArrayList<>(2000));
            storage.add(new ArrayList<>(400));
        }


        class Pack{
            public Pack(int id, int size) {
                this.id = id;
                this.size = size;
            }

            int id;
            int size;

            public int getId() {
                return id;
            }

            public int getSize() {
                return size;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setSize(int size) {
                this.size = size;
            }
        }

        int curS;
        int curM;
        int curL;
        Boolean store(Pack pack){
            switch (pack.size){
                case 1:
                    if (storage.get(0).size()>curS){
                        storage.get(0).add(pack);
                        curS++;
                        break;
                    }
                case 2:
                    if (storage.get(1).size()>curM){
                        storage.get(1).add(pack);
                        curM++;
                        break;
                    }
                case 3:
                    if (storage.get(2).size()>curL){
                        storage.get(2).add(pack);
                        curL++;
                        break;
                    }
                default:
                    return false;
            }
            return true;
        }
        //return index of warehouse
        int find(int packId){

            return -1;
        }
        //return Pack in certain location and remove it from storage
        Pack retrieve(int packId){

            return new Pack(1,1);
        }
    }
}
