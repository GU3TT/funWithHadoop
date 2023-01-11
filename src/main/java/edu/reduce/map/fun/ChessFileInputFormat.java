package edu.reduce.map.fun;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapred.*;

import java.io.IOException;

public class ChessFileInputFormat extends FileInputFormat<LongWritable, GameWritable> {
    public RecordReader<LongWritable, GameWritable> getRecordReader(InputSplit inputSplit, JobConf jobConf, Reporter reporter) throws IOException {
        return new ChessRecordReader();
    }
}
