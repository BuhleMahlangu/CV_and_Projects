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
    public partial class CreateForm : Form
    {
        SqlConnection conn;
        SqlCommand cmd;
        SqlDataAdapter adapt;
        DataSet ds;
        public const string connstr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\grp3PROJECT\Spaza_DB.mdf;Integrated Security=True";

        public CreateForm()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            try
            {
                using(conn = new SqlConnection(connstr))
                {
                    string ownerID = txtID.Text;
                    string contact = txtContactNum.Text;
                    string email = txtEmail.Text;

                    conn.Open();
                    string insertquery = "INSERT INTO Owner (ownerID, contact, email) VALUES (@ownerID, @contact, @email)";

                    cmd = new SqlCommand(insertquery, conn);
                    cmd.Parameters.AddWithValue("@ownerID", ownerID);
                    cmd.Parameters.AddWithValue("@contact", contact);
                    cmd.Parameters.AddWithValue("@email", email);

                    int rowsAffected = cmd.ExecuteNonQuery();
                    MessageBox.Show("Your login details have been created");
                    conn.Close();
                }
            }
            catch(SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void CreateForm_Load(object sender, EventArgs e)
        {
            
        }

        private void btnCustomerCreate_Click(object sender, EventArgs e)
        {
            try
            {
                using (conn = new SqlConnection(connstr))
                {
                    string customerID = txtID.Text;
                    string contact = txtContactNum.Text;
                    string email = txtEmail.Text;
                    string FName = txtFirstName.Text;
                    string LName = txtLastName.Text;

                    conn.Open();
                    string insertquery = "INSERT INTO Customer (customerID, FName, LName, contact, email) VALUES (@CustomerID, @FName, @LName, @Contact, @Email)";

                    cmd = new SqlCommand(insertquery, conn);
                    cmd.Parameters.AddWithValue("@CustomerID", customerID);
                    cmd.Parameters.AddWithValue("@FName", FName);
                    cmd.Parameters.AddWithValue("@LName", LName);
                    cmd.Parameters.AddWithValue("@Contact", contact);
                    cmd.Parameters.AddWithValue("@Email", email);

                    int rowsAffected = cmd.ExecuteNonQuery();
                    MessageBox.Show("Your login details have been created");
                    conn.Close();
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            txtFirstName.Visible = true;
            txtLastName.Visible = true;

            label7.Visible = true;
            label8.Visible = true;
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            //Open order form
        }
    }
}
