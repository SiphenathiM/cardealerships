package ac.za.cput.cardealership.services.finance.Impl;


import ac.za.cput.cardealership.domain.finance.CashSale;
import ac.za.cput.cardealership.services.finance.CashSaleService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashSaleServiceImpl implements CashSaleService {

    private static CashSaleServiceImpl respository = null;

    private Map<String, CashSale> cashSaleTable;

    private CashSaleServiceImpl() {
        cashSaleTable = new HashMap<String, CashSale>();
    }

    public static CashSaleServiceImpl getInstance(){
        if(respository==null)
            respository = new CashSaleServiceImpl();
        return respository;
    }

    @Override
    public CashSale create(CashSale cashSale) {
        cashSaleTable.put( cashSale.getPayType(), cashSale);
        CashSale savedCashSales= cashSaleTable.get( cashSale.getPayType());
        return savedCashSales;
    }

    @Override
    public CashSale read(String payType) {
        CashSale cashSale  =  cashSaleTable.get(payType);
        return cashSale ;
    }

    @Override
    public CashSale update(CashSale cashSale) {
        cashSaleTable.put(cashSale.getPayType(),cashSale);
        CashSale savedCashSale = cashSaleTable.get(cashSale.getPayType());
        return savedCashSale;
    }

    @Override
    public void delete(String payType) {
        cashSaleTable.remove(payType);
    }

    @Override
    public Set<CashSale> getAll() {
        return null;
    }
}
