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
    public partial class loginForm : Form
    {
        SqlConnection conn;
        private const string connstr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\loginForm\Spaza_DB.mdf;Integrated Security=True";
        SqlCommand cmd;
        SqlDataAdapter adapt;
        DataSet ds;

        public loginForm()
        {
            InitializeComponent();
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            string contact = txtContact.Text;
            string ownerID = txtID.Text;
            string email = txtEmail.Text;

            if(VerifyLogin(ownerID, contact, email))
            {
                MessageBox.Show("Login successful!");
                DialogResult = DialogResult.OK;

                MaintainForm maintain = new MaintainForm();
                maintain.ShowDialog();
            }
            else
            {
                MessageBox.Show("Invalid ownerID, contact, or email");
            }

            
        }

        private bool VerifyLogin(string ownerID, string contact, string email)
        {
            bool isValid = false;

            using (SqlConnection conn = new SqlConnection(connstr))
            {
                conn.Open();

                string query = "SELECT COUNT(*) FROM Owner WHERE ownerID LIKE @ownerID AND contact LIKE @contact AND email LIKE @email";
                cmd = new SqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@ownerID", ownerID);
                cmd.Parameters.AddWithValue("@contact", contact);
                cmd.Parameters.AddWithValue("@email", email);

                using (SqlDataReader read = cmd.ExecuteReader())
                {
                    if(read.Read())
                    {
                        int count = read.GetInt32(0);

                        if(count > 0)
                        {
                            isValid = true;
                        }
                    }
                }
            }
            return isValid;
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            UpdateForm update = new UpdateForm();
            update.Show();
            this.Hide();
        }

        private void loginForm_Load(object sender, EventArgs e)
        {

        }

        private void btnCreateDetails_Click(object sender, EventArgs e)
        {
            CreateForm create = new CreateForm();
            create.Show();

            this.Hide();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SupplierLogin supLogin = new SupplierLogin();
            supLogin.Show();
            this.Hide();
        }

        private void btnCustomerLog_Click(object sender, EventArgs e)
        {
            string contact = txtContact.Text;
            string customerID = txtID.Text;
            string email = txtEmail.Text;

            if (VerifyCustomerLogin(customerID, contact, email))
            {
                MessageBox.Show("Login successful!");
                DialogResult = DialogResult.OK;

                //Open Details

                Details detailsForm = new Details();
                detailsForm.Show();
                this.Hide();
            }
            else
            {
                MessageBox.Show("Invalid customerID, contact, or email");
            }
        }

        private bool VerifyCustomerLogin(string customerID, string contact, string email)
        {
            bool isValid = false;

            using (SqlConnection conn = new SqlConnection(connstr))
            {
                conn.Open();

                string query = "SELECT COUNT(*) FROM Customer WHERE customerID LIKE @CustomerID AND contact LIKE @Contact AND email LIKE @Email";
                cmd = new SqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@CustomerID", customerID);
                cmd.Parameters.AddWithValue("@Contact", contact);
                cmd.Parameters.AddWithValue("@Email", email);

                using (SqlDataReader read = cmd.ExecuteReader())
                {
                    if (read.Read())
                    {
                        int count = read.GetInt32(0);

                        if (count > 0)
                        {
                            isValid = true;
                        }
                    }
                }
            }
            return isValid;
        }
    }
}
