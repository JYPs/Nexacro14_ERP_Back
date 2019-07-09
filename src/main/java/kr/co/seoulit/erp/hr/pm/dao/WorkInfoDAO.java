package kr.co.seoulit.erp.hr.pm.dao;

import java.util.List;
import kr.co.seoulit.erp.hr.pm.to.WorkInfoTO;

public interface WorkInfoDAO {
    public List<WorkInfoTO> selectWorkInfoAll();
    
    public void updateWorkInfo(WorkInfoTO workInfoTO);
    
    public List<WorkInfoTO> selectWorkInfoCode();
}
