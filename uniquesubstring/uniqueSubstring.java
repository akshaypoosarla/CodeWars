/*
 * Complete the function below.
 */

    static String[] uniqueSubstrings(String inputString, int substringLength) {
       
        HashMap<String, int> map = new HashMap<String, int>();
    for (int i = 0; i <= inputString.length() - substringLength; i++) {
        String substr = inputString.substring(i, i + substringLength);
        if(map.containsKey(substr))
			{
				map.put(substr, map.get(substr)+1);
			}
			else
			{
				map.put(substr,1);
			}
        }
         String [] result = new String[map.size];
        Iterator it = map.entrySet().iterator();
        int counter =0;
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            result[counter] = pair.getKey();
			counter++;
            it.remove();
}
        return result;
}
     

