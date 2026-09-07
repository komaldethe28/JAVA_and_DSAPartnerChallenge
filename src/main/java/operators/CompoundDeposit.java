/*
Q14: Compound Deposit (2 Times Interest)
Story
Money gets interest twice (not real compound, but applied step by step). Find final amount.
*/

class CompoundDeposit {
    public static void main(String[] args){
        double principal=1000.0;
        double interestRate=0.10; //10%
        double first=principal+(principal*interestRate);  //first time compound interest
        double second=first+first*interestRate; //second time CI
        System.out.println("Compund interest for "+principal+" is "+second);
    }
}