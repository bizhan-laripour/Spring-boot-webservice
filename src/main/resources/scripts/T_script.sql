
ALTER PROCEDURE stp_medicalDocumentReport

    @patientName NVARCHAR(50),
        @patientLastName NVARCHAR(50)

    AS
    BEGIN
        select (p.name + ' '+p.last_name) AS patient,
               ('doctor '+d.name+' '+d.last_name) as doctor,
               (dad.country+' '+dad.city+' '+dad.address) as clinic,
               dTel.tell as clinicTel , ex.title AS doctorExperiance,
               doc.last_visit as lastVisit,
               doc.next_visit as nextVisit,
               doc.description as description
        FROM document as doc
                 Inner JOIN doctor AS d ON d.id = doc.doctor_id
                 INNER JOIN patient as p ON p.id = doc.patient_id
                 INNER JOIN address as dad ON d.address_id = dad.id
                 INNER JOIN telephone as dTel ON dTel.id = d.telephon_id
                 INNER JOIN expert as ex ON ex.id = d.expert_id
        WHERE p.name = @patientName AND p.last_name = @patientLastName

    END

GO

