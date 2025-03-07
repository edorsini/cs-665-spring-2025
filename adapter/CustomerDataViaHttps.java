package patterns.adapter;

/**
 * New System
 */
public interface CustomerDataViaHttps {
  void printCustomer(int customerId);

  Customer getCustomerViaHttps(int customerId);
}

