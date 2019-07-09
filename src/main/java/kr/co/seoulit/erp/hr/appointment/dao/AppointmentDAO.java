package kr.co.seoulit.erp.hr.appointment.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.appointment.to.AppointmentTO;

public interface AppointmentDAO {
	
	public List<AppointmentTO> selectAppointment();
	public void insertAppointment(AppointmentTO appointmentTO);
	public void updateAppointment(AppointmentTO appointmentTO);
//	public void deleteAppointment(AppointmentTO appointmentTO);
}
