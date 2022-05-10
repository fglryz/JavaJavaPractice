package day10_IfElse;

public class ClientWeb {

    public static void main(String[] args) {

        int statuCode = 301;

        String result = (statuCode == 200 || statuCode == 201 || statuCode == 202 || statuCode == 301 || statuCode == 303||
                statuCode == 304 || statuCode == 307 || statuCode == 400  || statuCode == 401 || statuCode == 403
                || statuCode == 404 || statuCode == 410 || statuCode == 500 || statuCode == 503)? (statuCode == 200)?
                "OK"  : (statuCode == 201)? "Created" : (statuCode == 202)? "Accepted" : (statuCode == 301)?
                "Moved Permanently" : (statuCode == 303)? "See Other" : (statuCode == 304)? "Not Modified" : (statuCode == 307)?
                "Temporary Redirect"  : (statuCode == 400)? "Bad Request " : (statuCode == 401)? "Unauthorized"
                : (statuCode == 403)? "Forbidden" : (statuCode == 404)? "Not Found" : (statuCode == 410)? "Gone"
                : (statuCode == 500)? "Internal Server Error" : "Service Unavailable" :"No Statu";

        System.out.println(result);
    }
}
/*
7.  HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.



 */