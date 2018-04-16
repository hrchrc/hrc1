package cn.clothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.clothes.service.FinancialManagementAccountReceivableService;
import cn.clothes.biz.FormJson;
import cn.clothes.domain.FinancialManagementAccountReceivable;

import cn.clothes.utils.Result;
/**应付款，供应商方面*/
@Controller
public class SupplierController {
	@Autowired
	private FinancialManagementAccountReceivableService financialManagementAccountReceivableService;
	@RequestMapping("/supplierList")
	public String supplierList() {
		return "supplier/supplier";//返回到下面的“SSJxin/src/main/webapp/WEB-INF/view/supplier/supplier.jsp”
	}
	/**
	 * 
	 * 分页显示
	 * @param curr
	 * @param limit
	 * @param keyword
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/supplierShow")
	@ResponseBody
	public FormJson supplierShow(Integer page,Integer limit,String keyword) {
		Page<FinancialManagementAccountReceivable> list;
		if(keyword==""||keyword==null) {
			 list=financialManagementAccountReceivableService.findAll(page-1, limit);
		}else {
			 list=financialManagementAccountReceivableService.findByOrderid(keyword, page-1, limit);
		}
		FormJson<FinancialManagementAccountReceivable> formJson=new FormJson<FinancialManagementAccountReceivable>();
		Integer count=financialManagementAccountReceivableService.getTotalCount();
		formJson.setCount(count);
		formJson.setData(list.getContent());
		formJson.setCode(0);
		return formJson;
	}
	@RequestMapping("/supplierDel")
	@ResponseBody
	public Result supplierDel(Long id) {
		Result result = financialManagementAccountReceivableService.deleteById(id);
		return result;
	}
	@RequestMapping("/showSupplier")
	public String showSupplierEdit(Model model,Long id) {
		FinancialManagementAccountReceivable fmap = financialManagementAccountReceivableService.findById(id);
		model.addAttribute("fmap", fmap);
		return "/supplier/supplierEdit";
	}
	@RequestMapping(value="/editSupplier",method=RequestMethod.POST)
	@ResponseBody
	public void editSupplier(FinancialManagementAccountReceivable financialManagementAccountReceivable) {
		/**/
		financialManagementAccountReceivableService.updateFinancialManagementAccountReceivable(financialManagementAccountReceivable);
	}
	/**
	 * 	展示添加商品
	 * @return
	 */
	@RequestMapping("/showAdd2")
	public String showAdd2() {
		return "/supplier/supplierEdit";
	}
	/**
	 * 增加商品
	 * @param financialManagementAccountReceivable
	 */
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	@ResponseBody
	public Result addSupplier(FinancialManagementAccountReceivable financialManagementAccountReceivable) {
		/**/
		return financialManagementAccountReceivableService.addFinancialManagementAccountReceivable(financialManagementAccountReceivable);
	}
}
