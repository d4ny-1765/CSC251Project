public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   public PolicyHolder ph;
   public static int policyCreated;

   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
      policyCreated++;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name

   */
   public Policy(String pNumber, String pName, PolicyHolder ph)
   {
      policyNumber = pNumber;
      providerName = pName;
      this.ph = new PolicyHolder(ph);
      policyCreated++;
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
   
   /**
   @return The Policy Holder Class
   */
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(ph);
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
   @param pHolder the Policy Holder's class
   */
   public void setPolicyHolder(PolicyHolder pHolder) {
      pHolder = new PolicyHolder(ph);
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
   
   public String toString() {
      return "Policy Number: " + policyNumber + "\n"
             + "Provider Name" + providerName + "\n"
             + ph + "\n"
             + String.format("Policy Price: %.2f" , getPrice());
   }

}