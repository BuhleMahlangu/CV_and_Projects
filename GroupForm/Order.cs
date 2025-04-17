using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace grp3PROJECT
{
    public partial class Order : Form
    {
        public Order()
        {
            InitializeComponent();
        }


        SqlConnection conn;
        SqlCommand command;
        SqlDataAdapter adapter;
        SqlDataReader reader;
        DataSet ds;

        private void Order_Load(object sender, EventArgs e)
        {
            string conStr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\loginForm\Spaza_DB.mdf;Integrated Security=True";
            conn = new SqlConnection(conStr);

            try
            {
                conn.Open();
                ds = new DataSet();
                string sql = @"SELECT DISTINCT orderDescription FROM [Order]";
                adapter = new SqlDataAdapter(sql, conn);
                adapter.Fill(ds, "Order");

                comboBox1.DisplayMember = "orderDescription";
                comboBox1.ValueMember = "orderDescription";
                comboBox1.DataSource = ds.Tables["Spaza_DB"];

                MessageBox.Show("Connected Successfully");
                conn.Close();

            }
            catch (SqlException error)
            {
                MessageBox.Show(error.Message);
            }
        }


       

       

        private void btnChoice_Click_1(object sender, EventArgs e)
        {
            string conStr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\loginForm\Spaza_DB.mdf;Integrated Security=True";
            conn = new SqlConnection(conStr);

            try
            {

                conn.Open();

                // using a comboBox to select items displayed on the data grid view
                string sql = @"SELECT * FROM [Order] WHERE orderDescription ='" + comboBox1.SelectedItem + "'";
                SqlCommand command = new SqlCommand(sql, conn);

               // SqlDataReader dataReader1;
               
                // OrderList.Items.Clear();



               // while (dataReader1.Read())
               // {

                 //   OrderList.Items.Add(dataReader1.GetValue(0) + "\t\t" + dataReader1.GetValue(2) + "\n");
                   // OrderList.SelectedIndex = -1;


                    // comboBox1.SelectedItem = "";
               // }

                //conn.Close();
               // dataReader1.Close();
            }
            catch (SqlException error)
            {

                MessageBox.Show(error.Message);
            }
        }

        private void btnRemove_Click(object sender, EventArgs e)
        {
            //Deleting selected values on the Orderlist
            if (OrderList.SelectedIndex != -1)
            {
                OrderList.Items.RemoveAt(OrderList.SelectedIndex);
            }
        }

        private void btnSubmitOrder_Click(object sender, EventArgs e)
        {

            // Create a new StringBuilder object to build the receipt text
            StringBuilder receiptText = new StringBuilder();

            // Add the receipt header
            receiptText.AppendLine("Receipt:");

            // Loop through the items in the Orderlist and add them to the receipt
            foreach (string item in OrderList.Items)
            {
                receiptText.AppendLine(item);
            }

            // Add the receipt footer
            receiptText.AppendLine("Thank you for your purchase!");

            // Display the receipt in a MessageBox
            MessageBox.Show(receiptText.ToString(), "Your order has been placed ");
            // MessageBox.Show(receiptText.ToString(), "Here's Your Order Receipt");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                conn.Open();
                // displaying the Order table on a data grid view
                string sql = @"SELECT * FROM [Order]";
                command = new SqlCommand(sql, conn);
                adapter = new SqlDataAdapter();
                ds = new DataSet();

                adapter.SelectCommand = command;
                adapter.Fill(ds, "Order");

                dataGridView1.DataSource = ds;
                dataGridView1.DataMember = "Order";
                conn.Close();

            }
            catch (SqlException error)
            {
                MessageBox.Show(error.Message);
            }
        }
    
    }
}

