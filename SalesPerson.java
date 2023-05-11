public class SalesPerson {
    private String id;

    private Sales[] salesHistory; // details of the different sales

    private int count = 0; // number of sales made



//constructor for a new salesperson


    public SalesPerson(String id){

// code missing
        this.id = id;
        this.salesHistory = new Sales[100];

    }



// constructor for a salesperson transferred (together with their sales details) from another branch

    public SalesPerson(String id, Sales[] s, int c){

// code missing
        this.id = id;
        this.salesHistory = s;
        this.count = c;

    }

    public SalesPerson() {

    }

    public Sales getSalesHistory(int i) {
        return this.salesHistory[i];

    }

    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){

        salesHistory[count] = s;

        count = count +1;

    }



    public double calcTotalSales(){

// calculates total sales for the salesperson

// code missing
        double total = 0;

        for(int i = 0; i<count; i++){
            total+=salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return total;

    }



    public Sales largestSale(){

// calculates the sale with the largest value

// code missing
        Sales highest = null;
        for(int i = 0; i<count; i++){
            if(salesHistory[i].getValue()*salesHistory[i].getQuantity() > highest.getValue()*highest.getQuantity()){
                highest = salesHistory[i];
            }
        }
        return highest;
    }



}



