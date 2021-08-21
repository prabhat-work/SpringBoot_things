Range Query Questions of L -- R  applying AND , OR operations 
------------------------------------------------------------------
just find the count of all bits in every range and store them in a 2-D array bitscount[32][100005] type where 32 is for 32bit number for each bits
go to each bit of array[i] and store count if it is set at the end if bitscount[i][r]-bitscount[i][l] == (r-l+1) then that mean we can include this bit 
