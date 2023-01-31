class HPVISACard extends VISACard{
    public Double computeRewardPoints(String type, Double amount){
			
        //fill code here

        Double r = super.computeRewardPoints(type, amount);
         return r + 10;
    }
}
