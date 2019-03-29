package org.jooq.mcve.test;

public class SimpleTest
{
    int timesCalled = 0;

    public void setValue(int i)
    {
        timesCalled++;
    }
}
