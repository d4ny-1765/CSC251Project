public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   public PolicyHolder ph;

   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name

   */
   public Policy(String pNumber, String pName, PolicyHolder pHolder)
   {
      policyNumber = pNumber;
      providerName = pName;
      ph = pHolder;
   }
   
   //getters//
   /**
   @return The Policy Number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   @return The Policy Provider's Name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
  
   
   //setters//
   
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
   @param pName The Policy Provider's name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
     
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(ph.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(ph.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(ph.getBMI() > BMI_THRESHOLD)
         price += ((ph.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
}