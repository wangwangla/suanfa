package com.letcode.nomal;

/**
 * Trapping	Rain	Water
 * 描述
 * Given		n		non-negative	integers	representing	an	elevation	map	where	the	width	of	each	bar	is	1, compute	how	much	water	it	is	able	to	trap	after	raining.
 * For	example,	Given		[0,1,0,2,1,0,1,3,2,1,2,1]	,	return	6.
 */
public class Question52 {
    //接雨水，可以每一行 ，没一行的求最后的结过加起来。
    public void soul(int arr[]){

    }
    public	static int	trap(int[]	A)	{
        final	int	n	=	A.length;
        int[]	left_peak	=	new	int[n];
        int[]	right_peak	=	new	int[n];
        for	(int	i	=	1;	i	<	n;	i++)	{
            left_peak[i]	=	Math.max(left_peak[i-1],	A[i-1]);
        }
        for	(int	i	=	n	-	2;	i	>=0;	--i)	{
            right_peak[i]	=	Math.max(right_peak[i+1],	A[i+1]);
        }
        int	sum	=	0;
        for	(int	i	=	0;	i	<	n;	i++)	{
            int	height	=	Math.min(left_peak[i],	right_peak[i]);
            if	(height	>	A[i])	{
                sum	+=	height	-	A[i];
            }
        }
        return	sum;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(arr);
    }
}
