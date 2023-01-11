package edu.reduce.map.fun;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapred.LineRecordReader;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

import java.io.IOException;

public class ChessRecordReader extends RecordReader<LongWritable, GameWritable> {
    LineRecordReader lineRecordReader = new LineRecordReader();

    public void initialize(InputSplit inputSplit, TaskAttemptContext taskAttemptContext) throws IOException, InterruptedException {

    }

    public boolean nextKeyValue() throws IOException, InterruptedException {
        return false;
    }

    public LongWritable getCurrentKey() throws IOException, InterruptedException {
        return null;
    }

    public GameWritable getCurrentValue() throws IOException, InterruptedException {
        return null;
    }

    public float getProgress() throws IOException, InterruptedException {
        return 0;
    }

    public void close() throws IOException {

    }
}
