package edu.reduce.map.fun;

import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class GameWritable  implements Writable {
    private Text id;
    private BooleanWritable rated;
    void write(DataOutput dataOutput) throws IOException {

    }

    public void readFields(DataInput dataInput) throws IOException {
        id.readFields(dataInput);
        rated.readFields(dataInput);

    }
}
