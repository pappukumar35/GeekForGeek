class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        //Write your code here
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
        for(int i=0;i<n;i++){
            pq.push({price[i],i+1});
        }
        int moneyLeft=k;
        int count=0;
        while(moneyLeft>0){
            pair<int,int> stock=pq.top();
            pq.pop();
            int stocksCanBeBought=moneyLeft/stock.first;
            if(stocksCanBeBought>stock.second){
                stocksCanBeBought=stock.second;
            }
            if(stocksCanBeBought==0){
                break;
            }
            count+=stocksCanBeBought;
            moneyLeft-=stock.first*stocksCanBeBought;
        }
        
        return count;
    }
};