package com.tencent.mm.network.a;

public final class a$a
{
  public long bYi = 0L;
  public long beginTime = 0L;
  public boolean cfA = false;
  public long cfB = 0L;
  public long cfC = 0L;
  public long cfD = 0L;
  public int cfE = 0;
  public int cfF = 0;
  public long cfG = 0L;
  public long cfH = 0L;
  public long cfI = 0L;
  public c cfz;
  public String clientIp = "";
  public long endTime = 0L;
  public int errCode = 0;
  public int errType = 0;
  public long expand1 = 0L;
  public long expand2 = 0L;
  public long netSignal = 0L;
  public int netType = 0;
  public int retryCount = 0;
  public long rtType = 0L;
  
  public final String toString()
  {
    long l1 = rtType;
    long l2 = beginTime;
    long l3 = endTime;
    long l4 = endTime;
    long l5 = beginTime;
    long l6 = bYi;
    long l7 = cfD;
    if (cfz == null) {}
    for (String str = "null";; str = cfz.toString()) {
      return String.format("rtType:%d begin:%d, end:%d time:%d cost:%d count:%d ipInfo:%s socket:%b netType:%d err:(%d,%d) tx:%d rx:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4 - l5), Long.valueOf(l6), Long.valueOf(l7), str, Boolean.valueOf(cfA), Integer.valueOf(netType), Integer.valueOf(errType), Integer.valueOf(errCode), Long.valueOf(cfB), Long.valueOf(cfC) });
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.network.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */