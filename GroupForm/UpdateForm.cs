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
    public partial class UpdateForm : Form
    {
        SqlConnection conn;
        SqlCommand cmd;
        public const string connstr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\grp3PROJECT\Spaza_DB.mdf;Integrated Security=True";
        SqlDataAdapter adapt;
        DataSet ds;

        public UpdateForm()
        {
            InitializeComponent();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {
                string ownerID = txtOwnerID.Text;
                string newContactNum = txtNewContactNum.Text;
                string newEmail = txtNewEmail.Text;

                using (conn = new SqlConnection(connstr))
                {
                    string update = "UPDATE Owner SET contact = @newContactNum, email = @newEmail WHERE ownerID = @ownerID";
                    conn.Open();
                    cmd = new SqlCommand(update, conn);

                    cmd.Parameters.AddWithValue("@newContactNum", newContactNum);
                    cmd.Parameters.AddWithValue("@newEmail", newEmail);
                    cmd.Parameters.AddWithValue("@ownerID", ownerID);
                    cmd.ExecuteNonQuery();

                    MessageBox.Show("Information updated successfully!");
                    conn.Close();
                }
            }
            catch(SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void UpdateForm_Load(object sender, EventArgs e)
        {
            
        }

        private void btnReturn_Click(object sender, EventArgs e)
        {
            loginForm logform = new loginForm();
            logform.Show();
            this.Hide();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                string CustomersID = txtOwnerID.Text;
                string newContactNum = txtNewContactNum.Text;
                string newEmail = txtNewEmail.Text;

                using (conn = new SqlConnection(connstr))
                {
                    string update = "UPDATE Customer SET contact = @newContactNum, email = @newEmail WHERE CustomerID = @CustomersID";
                    conn.Open();
                    cmd = new SqlCommand(update, conn);

                    cmd.Parameters.AddWithValue("@newContactNum", newContactNum);
                    cmd.Parameters.AddWithValue("@newEmail", newEmail);
                    cmd.Parameters.AddWithValue("@CustomersID", CustomersID);
                    cmd.ExecuteNonQuery();

                    MessageBox.Show("Information updated successfully!");
                    conn.Close();
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
