package patterns.adapter;

/**
 * Legacy System
 */
public interface CustomerDataViaUsb {
  void printCustomer(int customerId);

  Customer getCustomerViaUsb(int customerId);
}

