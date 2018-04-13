package cn.clothes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import cn.clothes.domain.FinancialManagementAccountPayable;
import cn.clothes.domain.FinancialManagementAccountReceivable;
import cn.clothes.utils.Result;
/**供应商服务接口类1*/
public interface FinancialManagementAccountReceivableService {
	Result addFinancialManagementAccountReceivable(FinancialManagementAccountReceivable financialManagementAccountReceivable);
	Integer getTotalCount();
	Page<FinancialManagementAccountReceivable> findAll(Integer page,Integer limit);
	Page<FinancialManagementAccountReceivable> findByOrderid(String keyword,Integer page,Integer limit);
	Result deleteById(Long id);
	FinancialManagementAccountReceivable findById(Long id);
	Result updateFinancialManagementAccountReceivable(FinancialManagementAccountReceivable financialManagementAccountReceivable);
	List<FinancialManagementAccountReceivable> findByPage(Integer page,Integer limit);
}
