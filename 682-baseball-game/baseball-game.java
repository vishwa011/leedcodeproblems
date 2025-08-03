class Solution {
    public int calPoints(String[] operations) {
        
        ArrayList<Integer> record = new ArrayList();

        for(String ops:operations){
            if(ops.equals("C")){
                if(!record.isEmpty()){
                    record.remove(record.size()-1);
                }
            }else if(ops.equals("D")){
                if(!record.isEmpty()){
                    int last = record.get(record.size()-1);
                    record.add(last * 2);
                }
            }else if(ops.equals("+")){
                if(record.size()>=2){
                    int last = record.get(record.size()-1);
                    int secondlast = record.get(record.size()-2);
                    record.add(secondlast+last);
                }
            }else{
                record.add(Integer.parseInt(ops));
            }
        }
        int sum = 0;
        for(int score:record){
            sum +=score;
        }
        return sum;
    }
}