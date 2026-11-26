class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum =0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                    int a = st.pop();
                    int b = st.peek();
                    int add = a+b;
                    sum+=add;
                    st.push(a);
                    st.push(add);
                
            }
            else if(operations[i].equals("D")){
                
                    int ans = st.peek();
                    sum+= ans*2;
                    st.push(ans*2);
                
            }
            else if(operations[i].equals("C")){
                    int a = st.pop();
                    sum-= a;
                   
            
        }
            else{
                int a = Integer.parseInt(operations[i]);
                sum+= a;
                st.push(a);
            }

            
        }
        return sum;
    }
}