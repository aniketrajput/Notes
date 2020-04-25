grant execute on utl_file to aniket;

create or replace directory dir_utl as 'c:\users\inarajp\documents';
grant read on directory dir_utl to aniket;
grant write on directory dir_utl to aniket;

grant read, write on directory dir_utl to aniket;

declare
	fp utl_file.file_type;
begin
  fp:= utl_file.fopen('DIR_UTL', 'file1.txt', 'w');
  utl_file.putf(fp,'abc0');
  utl_file.fclose(fp);	
end;


begin
  xml_file_handling.OpenXmlFile('abc');
end;


create directory dir_utl as 'C:\Users\inarajp\Documents\';


select * from dba_directories ;

select name from v$parameter where name='dir_utl';

select grantor, 
       grantee, 
       table_schema, 
       table_name, 
       privilege
from   all_tab_privs ;


select * from all_tab_privs
where  table_name = 'DIR_UTL'
and    privilege = 'WRITE';


DROP USER HMPOZNAN CASCADE;

alter user HMPOZNAN account lock;

select * from all_users;

select * from v$session where schemaname = 'HMPOZNAN' and status='ACTIVE';

select * from dba_jobs where schema_user='HMPOZNAN' and broken='N';

ALTER SYSTEM KILL SESSION '199,2985';

ALTER SYSTEM KILL SESSION '10,8152';

ALTER SYSTEM KILL SESSION '105,22914';

ALTER SYSTEM KILL SESSION '203,48922';

ALTER SYSTEM KILL SESSION '494,22510';

ALTER SYSTEM KILL SESSION '601,55758';

ALTER SYSTEM KILL SESSION '684,9979';

ALTER SYSTEM KILL SESSION '693,36494';

ALTER SYSTEM KILL SESSION '312,4296';

ALTER SYSTEM KILL SESSION '490,7214';

DBMS_JOB.BROKEN ( 
   job       IN  BINARY_INTEGER,
   broken    IN  BOOLEAN,
   next_date IN  DATE DEFAULT SYSDATE);

alter user HMPOZNAN rename to HMPOZNAN_old;



begin
   sys.dbms_ijob.broken(2205,TRUE);
end;


select * from dba_directories;

grant create public database link to HMPoznan;
grant drop public database link to HMPoznan;

grant connect,resource to HMPoznan;

grant select on sys.all_tables to HMPoznan;

CREATE OR REPLACE directory DATA_PUMP_DIR AS 'G:\HuM_DBDump\ProjExport';


select * from ALERT_QT;


select object_type,count(1) from user_objects group by object_type;

select 'select count(1) from '||table_name||';' from user_tables; 






