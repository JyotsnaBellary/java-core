class MovieRating extends Thread{
    String ratings;
    
    public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public MovieRating() { }
    
    public MovieRating(String ratings) {
        this.ratings = ratings;
    }
    
    public void run() {
        //Fill your code here
    	String[] arr = this.ratings.split(",");
    	;
    	
    	for(String i: arr) {
    		
    	}
    }
}