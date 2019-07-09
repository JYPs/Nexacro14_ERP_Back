package kr.co.seoulit.erp.hr.appointment.dao;

import java.util.List;

import kr.co.seoulit.erp.hr.appointment.to.PersonalAppointmentTO;

public interface PersonalAppointmentDAO {
	
	public List<PersonalAppointmentTO> selectPersonalAppointment();
	public void insertPersonalAppointment(PersonalAppointmentTO personalAppointmentTO);
	public void updatePersonalAppointment(PersonalAppointmentTO personalAppointmentTO);
//	public void deletePersonalAppointment(PersonalAppointmentTO personalAppointmentTO);

}
