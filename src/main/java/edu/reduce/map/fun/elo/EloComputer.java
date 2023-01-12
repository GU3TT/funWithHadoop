package edu.reduce.map.fun.elo;

import edu.reduce.map.fun.GameWritable;
import edu.reduce.map.fun.GameWritables;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class EloComputer extends Mapper<LongWritable, GameWritable, LongWritable, IntWritable> {


    @Override
    protected void map(LongWritable key, GameWritable value, Context context) throws IOException, InterruptedException {

    }
}
