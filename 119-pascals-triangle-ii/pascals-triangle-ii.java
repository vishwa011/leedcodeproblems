class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> Row = new ArrayList<>();
        Row.add(1);

        for(int i=0; i<rowIndex; i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
                for(int j=1; j<Row.size(); j++){
                    newRow.add(Row.get(j-1) + Row.get(j));
                }
                newRow.add(1);
                Row = newRow;
        }
        return Row;
    }
}