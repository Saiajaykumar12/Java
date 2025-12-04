class Bill{
    void generateBill(Product obj,Customer c,int discount){
         obj.setName("Mobile");
        obj.setPrice(35000.00);

        discount = 30;
        double discountedPrice = obj.getPrice() * (discount / 100.0);

        System.out.println("Product name: "+obj.getName());
        System.out.println("Product Price: "+obj.getPrice());
        System.out.println("Discounted Price: "+(obj.getPrice() - discountedPrice));

        System.out.println("Customer name: "+c.getName());
        System.out.println("Customer count: "+c.getCustomerCount());
        
    }
}